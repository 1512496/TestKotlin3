package com.example.testkotlin3

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.testkotlincode.stepbystepengine.Constan
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import com.jjoe64.graphview.series.PointsGraphSeries
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input="y=-x^{4}-2x^{2}+1"
        var constan= Constan(input);
        var listrs=constan.solution();
        var text=""
        for(i in 0..listrs.size-1){
            text+=listrs[i]
            text+="\n"
        }
        button.setOnClickListener {
            text_view.setText(text)
            constan.drawGraph(graph,1.0)
        }
    }
}
