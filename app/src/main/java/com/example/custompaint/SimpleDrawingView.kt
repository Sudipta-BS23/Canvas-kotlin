package com.example.custompaint

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SimpleDrawingView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private lateinit var drawPaint: Paint

    init {
        setupPaint()
    }

    private fun setupPaint() {
        drawPaint = Paint()
        drawPaint.color = Color.BLACK
        drawPaint.isAntiAlias = true
        drawPaint.strokeWidth = 5F
        drawPaint.style = Paint.Style.STROKE
        drawPaint.strokeJoin = Paint.Join.ROUND
        drawPaint.strokeCap = Paint.Cap.ROUND
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRect(10F, 10F, 1000F, 340F, drawPaint)

        canvas?.drawText("Drag No.", 40F, 100F, drawPaint.apply { style = Paint.Style.FILL; textSize = 60F })
        canvas?.drawText("Straight", 290F, 100F, drawPaint.apply { style = Paint.Style.FILL; textSize = 60F })
        canvas?.drawText("Rumble", 540F, 100F, drawPaint.apply { style = Paint.Style.FILL; textSize = 60F })
        canvas?.drawText("Lucky", 790F, 100F, drawPaint.apply { style = Paint.Style.FILL; textSize = 60F })

        canvas?.drawLine( 40F, 180F, 960F, 180F, drawPaint)

        canvas?.drawText("123", 40F, 280F, drawPaint.apply { letterSpacing=0.5F; style = Paint.Style.FILL; textSize = 60F })
        canvas?.drawText("1", 380F, 280F, drawPaint.apply { style = Paint.Style.FILL; textSize = 60F })
        canvas?.drawText("2", 630F, 280F, drawPaint.apply { style = Paint.Style.FILL; textSize = 60F })
        canvas?.drawText("1", 840F, 280F, drawPaint.apply { style = Paint.Style.FILL; textSize = 60F })
    }
}