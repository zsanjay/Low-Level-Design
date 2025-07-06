package org.sanjay.lld.design.patternsV2.creational.builder;

public class Employee {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    @Override
    public String toString() {
        return "Employee Details : " +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Address='" + address + '\'' +
                ", Phone Number='" + phoneNumber + '\'' +
                ", Email='" + email + '\'';
    }

    static class EmployeeBuilder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;
        private String email;

        public EmployeeBuilder(String name, int age, String phoneNumber) {
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

}
