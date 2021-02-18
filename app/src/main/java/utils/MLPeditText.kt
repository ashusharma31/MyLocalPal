package utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class MLPeditText(context:Context,attr:AttributeSet):AppCompatEditText(context,attr)
{
    init{
        applyMyType();
    }
    private fun applyMyType()
    {
        val typeface:Typeface= Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        setTypeface(typeface)
    }
}