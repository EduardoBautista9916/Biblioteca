package com.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Languages {
    private String availableLanguages[][];
    private String selectLanguage[];


    public Languages(){
        availableLanguages = new String[][] {
            {"English", "en_EN"},
            {"Spanish", "es_ES"},
            {"Italian", "it_IT"},
            {"French", "fr_FR"},
            {"Russian","ru_RU"},
            {"German","de_DE"},
            {"Japanese","ja_JP"},
            {"Chinese", "zh_TW"},
            {"Korean", "ko_KR"},
            {"Polish", "pl_PL"}
        };

        selectLanguage = availableLanguages[0];

    }

    // Setters and Getters
    public String[][] getAvaibleLanguages(){
        return availableLanguages;
    }

    public void setSelectLanguage(String[] language){
        selectLanguage = language;
    }

    public String getSelectLanguage(){
        return selectLanguage[1];
    }

}
