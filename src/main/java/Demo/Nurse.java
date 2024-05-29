package Demo;


public class Nurse implements Staff{
    private int nurseId;
    public void assist(){
        System.out.println("Nurse assist patients");
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }
}
