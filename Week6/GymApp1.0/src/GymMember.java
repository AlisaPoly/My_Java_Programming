public class GymMember {
    private String name = "";
    private double height = 0.5;
    private double weight = 25;
    private int membershipNumber = 99999;
    private boolean isCurrentGymMember = false;

    //------------------//
    //   constructors   //
    //------------------//

    public GymMember(String name, double height, double weight, int membershipNumber, boolean isCurrentGymMember) {
        if (name.length()<= 30)
            this.name = name;
        else
            this.name = name.substring(0,30);
        setHeight(height);
        setWeight(weight);
        setMembershipNumber(membershipNumber);
        this.isCurrentGymMember = isCurrentGymMember;
    }

//------------------//
//     getters      //
//------------------//

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public boolean getIsCurrentGymMember() {
        return isCurrentGymMember;
    }

//------------------//
//     setters      //
//------------------//

    public void setName(String name) {
        if (name.length() <= 30)
            this.name = name;
    }
    public void setHeight(double height) {
        if ((height >= 0.5) && (height <= 3.0))
            this.height = height;
    }
    public void setWeight(double weight) {
        if ((weight >= 25) && (weight <= 600))
            this.weight = weight;
    }
    public void setMembershipNumber(int membershipNumber) {
        if ((membershipNumber >= 1) && (membershipNumber<=99999))
            this.membershipNumber = membershipNumber;
    }

    public String toString() {
        String formated = String.format("%05d", membershipNumber);
      return "Name: "+name+"\nHeight: "+height+"\nWeight: "+weight+"\nMembership Number: "+formated+"\nIs Current Gym Member: "+isCurrentGymMember;
    }
}

