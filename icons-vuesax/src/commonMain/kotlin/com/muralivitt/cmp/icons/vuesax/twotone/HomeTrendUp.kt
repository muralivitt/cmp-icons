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

val VuesaxIconsTwotone.HomeTrendUp: ImageVector
    get() {
        if (_HomeTrendUp != null) {
            return _HomeTrendUp!!
        }
        _HomeTrendUp = ImageVector.Builder(
            name = "HomeTrendUp",
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
                moveTo(9.02f, 2.84f)
                lineTo(3.63f, 7.04f)
                curveTo(2.73f, 7.74f, 2f, 9.23f, 2f, 10.36f)
                verticalLineTo(17.77f)
                curveTo(2f, 20.09f, 3.89f, 21.99f, 6.21f, 21.99f)
                horizontalLineTo(17.79f)
                curveTo(20.11f, 21.99f, 22f, 20.09f, 22f, 17.78f)
                verticalLineTo(10.5f)
                curveTo(22f, 9.29f, 21.19f, 7.74f, 20.2f, 7.05f)
                lineTo(14.02f, 2.72f)
                curveTo(12.62f, 1.74f, 10.37f, 1.79f, 9.02f, 2.84f)
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
                moveTo(16.5f, 11.5f)
                lineTo(12.3f, 15.7f)
                lineTo(10.7f, 13.3f)
                lineTo(7.5f, 16.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 11.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.5f)
            }
        }.build()

        return _HomeTrendUp!!
    }

@Suppress("ObjectPropertyName")
private var _HomeTrendUp: ImageVector? = null
