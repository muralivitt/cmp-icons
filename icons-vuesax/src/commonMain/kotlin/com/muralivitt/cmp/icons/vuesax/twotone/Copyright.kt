package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Copyright: ImageVector
    get() {
        if (_Copyright != null) {
            return _Copyright!!
        }
        _Copyright = ImageVector.Builder(
            name = "Copyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                curveTo(17.52f, 2f, 22f, 6.48f, 22f, 12f)
                curveTo(22f, 17.52f, 17.52f, 22f, 12f, 22f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.88f, 15f)
                curveTo(14.17f, 15.62f, 13.25f, 16f, 12.24f, 16f)
                curveTo(10.03f, 16f, 8.24f, 14.21f, 8.24f, 12f)
                curveTo(8.24f, 9.79f, 10.03f, 8f, 12.24f, 8f)
                curveTo(13.25f, 8f, 14.17f, 8.38f, 14.88f, 9f)
            }
        }.build()

        return _Copyright!!
    }

@Suppress("ObjectPropertyName")
private var _Copyright: ImageVector? = null
