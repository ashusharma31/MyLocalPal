package utils

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import java.util.jar.Attributes
import android.graphics.Typeface


class MSPTextViewBold(context:Context,attr:AttributeSet): AppCompatTextView(context,attr)
{
    init {
       applyFont()
    }
    private fun applyFont()
    {
        val typeface:Typeface=Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        setTypeface(typeface)
    }
}