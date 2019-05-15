package com.example.testkotlincode.expression

interface FormalExpression {
    public abstract fun evalute(x: Double): Double
    public abstract fun derive(): FormalExpression
    public abstract fun expToString(): String
}