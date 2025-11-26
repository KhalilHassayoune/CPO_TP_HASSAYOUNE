/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
public class Question {
    private String intitule;
    private String proposition1;
    private String proposition2;
    private String proposition3;
    private String proposition4;
    private int indexBonneReponse;
    private int indexQuestionCourante = 0;
    
    public Question(String intitule, String proposition1, String proposition2, String proposition3, String proposition4, int indexBonneReponse,String tab ) {
        this.intitule = intitule;
        this.proposition1 = proposition1;
        this.proposition2 = proposition2;
        this.proposition3 = proposition3;
        this.proposition4 = proposition4;
        this.indexBonneReponse = indexBonneReponse;
        if (indexBonneReponse<1)indexBonneReponse=1;
        if (indexBonneReponse>4)indexBonneReponse=4;
    }
    

    public String getIntitule() {
        return intitule;
    }

    public String getProposition1() {
        return proposition1;
    }

    public String getProposition2() {
        return proposition2;
    }

    public String getProposition3() {
        return proposition3;
    }

    public String getProposition4() {
        return proposition4;
    }

    public int getIndexBonneReponse() {
        return indexBonneReponse;
    }

    private void setText(String intitule) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}




