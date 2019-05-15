package com.example.testkotlincode.stepbystepengine

import com.example.testkotlincode.stepbystepengine.MathType

class Equation(_latexExpression : String) : MathType(_latexExpression){
    public fun latexToFormalExpression(): String{

        return ""
    }
    override  public fun solution(): List<String>{
        return arrayListOf()
    }
}