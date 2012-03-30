package org.cse.springtute;

/**
 * 
 * @author Tharindu Amila
 */
public class Student {

	private String firstName;
	private String lastName;
	private long regNumber;
	private String address;

        /**
         * 
         */
        public Student(){

        }
        /**
         * 
         * @param index
         * @param firstName
         * @param lastName
         * @param address
         */
        public Student(long index,String firstName,String lastName,String address){
            regNumber=index;
            this.firstName=firstName;
            this.lastName=lastName;
            this.address=address;
        }

        /**
         * 
         * @return
         */
        public long getRegNumber() {
        return regNumber;
    }

    /**
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @param regNumber
     */
    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    /**
     * 
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @return
     */
    public String getAddress() {
        return address;
    }
    
}
