package com.example.testkotlincode.stepbystepengine



class MathTypeFactory() {
    companion object {
        public fun getMathType(latexExpression: String): MathType {
            if (latexExpression == "") {
                return Constan("")
            } else {
                return Constan(latexExpression)
            }
        }
    }
}