package design.builderpattern.finalsolution;

import java.security.InvalidParameterException;

public class StudentModified4 {

    private final String name;
    private final String address;
    private final int id;


    private StudentModified4(Builder b){
        this.name = b.name;
        this.address = b.address;
        this.id = b.id;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String address;
        private int id;

        public Builder(){

        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public StudentModified4 build(){
            if(name==null){
                throw new IllegalStateException("Name required");
            }
            return new StudentModified4(this);
        }
        public StudentModified4 validateAndBuild() throws RuntimeException {
            if (address.length() > 1000) {
                throw new InvalidParameterException();
            }
            return new StudentModified4(this);
        }

    }



    public static void main(String[] args){
        StudentModified4 s = StudentModified4.getBuilder().setName("Aditya").setAddress("119").build();
        System.out.println(s.name);
    }

}
