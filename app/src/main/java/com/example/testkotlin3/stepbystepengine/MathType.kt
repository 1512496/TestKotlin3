package com.example.testkotlincode.stepbystepengine

abstract class MathType(_latexExpression: String) {
    protected var latexExpression: String=_latexExpression
    public abstract fun solution(): List<String>
}