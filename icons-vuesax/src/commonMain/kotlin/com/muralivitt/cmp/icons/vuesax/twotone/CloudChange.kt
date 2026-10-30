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

val VuesaxIconsTwotone.CloudChange: ImageVector
    get() {
        if (_CloudChange != null) {
            return _CloudChange!!
        }
        _CloudChange = ImageVector.Builder(
            name = "CloudChange",
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
                moveTo(8.11f, 11.85f)
                curveTo(5.29f, 12.05f, 5.3f, 16.15f, 8.11f, 16.35f)
                horizontalLineTo(14.78f)
                curveTo(15.59f, 16.36f, 16.37f, 16.05f, 16.97f, 15.51f)
                curveTo(18.95f, 13.78f, 17.89f, 10.31f, 15.29f, 9.98f)
                curveTo(14.36f, 4.34f, 6.21f, 6.48f, 8.14f, 11.85f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                curveTo(2f, 18.87f, 5.13f, 22f, 9f, 22f)
                lineTo(7.95f, 20.25f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                curveTo(22f, 5.13f, 18.87f, 2f, 15f, 2f)
                lineTo(16.05f, 3.75f)
            }
        }.build()

        return _CloudChange!!
    }

@Suppress("ObjectPropertyName")
private var _CloudChange: ImageVector? = null
