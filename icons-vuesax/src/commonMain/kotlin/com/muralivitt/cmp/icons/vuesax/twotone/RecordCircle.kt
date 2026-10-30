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

val VuesaxIconsTwotone.RecordCircle: ImageVector
    get() {
        if (_RecordCircle != null) {
            return _RecordCircle!!
        }
        _RecordCircle = ImageVector.Builder(
            name = "RecordCircle",
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
                moveTo(11.971f, 22f)
                curveTo(17.494f, 22f, 21.971f, 17.523f, 21.971f, 12f)
                curveTo(21.971f, 6.477f, 17.494f, 2f, 11.971f, 2f)
                curveTo(6.448f, 2f, 1.971f, 6.477f, 1.971f, 12f)
                curveTo(1.971f, 17.523f, 6.448f, 22f, 11.971f, 22f)
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
                moveTo(12f, 16.23f)
                curveTo(14.336f, 16.23f, 16.229f, 14.336f, 16.229f, 12f)
                curveTo(16.229f, 9.664f, 14.336f, 7.77f, 12f, 7.77f)
                curveTo(9.663f, 7.77f, 7.77f, 9.664f, 7.77f, 12f)
                curveTo(7.77f, 14.336f, 9.663f, 16.23f, 12f, 16.23f)
                close()
            }
        }.build()

        return _RecordCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RecordCircle: ImageVector? = null
