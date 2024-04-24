package cpsc411.simplehttpclient

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class LableColumnGenerator(val ctx : Context) {

    fun generate() : LinearLayout {
        val layoutObj = LinearLayout(ctx)
        val lParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutObj.layoutParams = lParams
        layoutObj.orientation = LinearLayout.VERTICAL

        val lbParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        lbParams.weight = 5.0F
        lbParams.topMargin = 4
        var lbl = TextView(ctx)
        lbl.text = "Claim"
        lbl.gravity = Gravity.CENTER
        lbl.setBackgroundColor(Color.YELLOW)
        layoutObj.addView(lbl, lbParams)
        lbl = TextView(ctx)
        lbl.text = "Date"
        lbl.gravity = Gravity.CENTER
        lbl.setBackgroundColor(Color.YELLOW)
        layoutObj.addView(lbl, lbParams)
        lbl = TextView(ctx)
        lbl.text = "Status Message"
        lbl.gravity = Gravity.CENTER
        lbl.setBackgroundColor(Color.RED)
        layoutObj.addView(lbl, lbParams)
        lbl = TextView(ctx)

        return layoutObj
    }
}