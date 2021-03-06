package com.example.testkotlincode.expression

import com.example.testkotlincode.expression.FormalExpression

class ConstExp(_value: Double): FormalExpression {
    private var value: Double=_value
    override public fun evalute(x: Double): Double {
        return this.value
    }

    override fun derive(): FormalExpression{
        return ConstExp(0.0)
    }

    override fun expToString(): String{
        if(this.value==0.0){
            return ""
        }else{
        return this.value.toString()
        }
    }
}