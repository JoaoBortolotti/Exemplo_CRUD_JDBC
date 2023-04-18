package br.com.ExemploJDBC.model;

public class Students {
    private int idStudent;
    private String first_name;
    private int dept_id;
    private String tot_cred;

    public int getIdStudent(){
        return this.idStudent;
    }
    public void setIdStudent(int idStudent){
        this.idStudent = idStudent;
    }

    public String getFirst_name(){
        return this.first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public int getDept_id(){
        return this.dept_id;
    }
    public void setDept_id(int dept_id){
        this.dept_id = dept_id;
    }
    
    public String getTot_cred(){
        return this.tot_cred;
    }
    public void setTot_cred(String tot_cred){
        this.tot_cred = tot_cred;
    }

}
