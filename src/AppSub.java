
public class AppSub {
    private Double id;
    private String time_unit;

    private String text;

    public void setId(Double id){
        this.id=id;
    }
    public Double getId(){
        return this.id;
    }
    public void setTime_unit(String time_unit){
        this.time_unit=time_unit;
    }
    public String getTime_unit(){
        return this.time_unit;
    }

    public void setText(String text){
        this.text=text;
    }
    public String getText(){
        return this.text;
    }
}
