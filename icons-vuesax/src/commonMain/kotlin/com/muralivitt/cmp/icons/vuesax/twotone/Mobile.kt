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

val VuesaxIconsTwotone.Mobile: ImageVector
    get() {
        if (_Mobile != null) {
            return _Mobile!!
        }
        _Mobile = ImageVector.Builder(
            name = "Mobile",
            defaultWidth = 18.dp,
            defaultHeight = 22.dp,
            viewportWidth = 18f,
            viewportHeight = 22f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 6f)
                verticalLineTo(16f)
                curveTo(17f, 20f, 16f, 21f, 12f, 21f)
                horizontalLineTo(6f)
                curveTo(2f, 21f, 1f, 20f, 1f, 16f)
                verticalLineTo(6f)
                curveTo(1f, 2f, 2f, 1f, 6f, 1f)
                horizontalLineTo(12f)
                curveTo(16f, 1f, 17f, 2f, 17f, 6f)
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
                moveTo(11f, 4.5f)
                horizontalLineTo(7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18.1f)
                curveTo(9.856f, 18.1f, 10.55f, 17.406f, 10.55f, 16.55f)
                curveTo(10.55f, 15.694f, 9.856f, 15f, 9f, 15f)
                curveTo(8.144f, 15f, 7.45f, 15.694f, 7.45f, 16.55f)
                curveTo(7.45f, 17.406f, 8.144f, 18.1f, 9f, 18.1f)
                close()
            }
        }.build()

        return _Mobile!!
    }

@Suppress("ObjectPropertyName")
private var _Mobile: ImageVector? = null
