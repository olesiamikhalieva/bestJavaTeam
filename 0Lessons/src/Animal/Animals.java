package Animal;

/**
 * Created by java on 30.01.2018.
 */
public class Animals {
    private String headForm;

    protected void sayMyNameAndWhatICan(){
        System.out.print("my head form is " + this.headForm + " , " + breathe() + " , ");
    }

    private String breathe(){
        return "I am breathe";
    }

    public Animals(){
    }

    public String getHeadForm() {
        return headForm;
    }

    public void setHeadForm(String headForm) {
        this.headForm = headForm;
    }
}
