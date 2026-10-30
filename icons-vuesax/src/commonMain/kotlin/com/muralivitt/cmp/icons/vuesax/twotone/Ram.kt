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

val VuesaxIconsTwotone.Ram: ImageVector
    get() {
        if (_Ram != null) {
            return _Ram!!
        }
        _Ram = ImageVector.Builder(
            name = "Ram",
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
                moveTo(3.5f, 7f)
                verticalLineTo(17f)
                curveTo(3.5f, 20f, 4.97f, 22f, 8.5f, 22f)
                horizontalLineTo(15.5f)
                curveTo(18.97f, 22f, 20.5f, 20f, 20.5f, 17f)
                verticalLineTo(15.83f)
                curveTo(20.5f, 15.3f, 20.29f, 14.79f, 19.91f, 14.42f)
                lineTo(19.08f, 13.59f)
                curveTo(18.7f, 13.21f, 18.49f, 12.71f, 18.49f, 12.18f)
                verticalLineTo(10f)
                curveTo(18.49f, 9.45f, 18.94f, 9f, 19.49f, 9f)
                curveTo(20.04f, 9f, 20.49f, 8.55f, 20.49f, 8f)
                verticalLineTo(7f)
                curveTo(20.49f, 4f, 18.96f, 2f, 15.49f, 2f)
                horizontalLineTo(8.49f)
                curveTo(4.97f, 2f, 3.5f, 4f, 3.5f, 7f)
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
                moveTo(7.99f, 21.97f)
                lineTo(7.98f, 19f)
                curveTo(7.98f, 17.89f, 8.87f, 17f, 9.98f, 17f)
                horizontalLineTo(13.991f)
                curveTo(15.09f, 17f, 15.981f, 17.89f, 15.991f, 18.99f)
                lineTo(16.021f, 21.98f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.97f, 7.78f)
                horizontalLineTo(7.97f)
            }
        }.build()

        return _Ram!!
    }

@Suppress("ObjectPropertyName")
private var _Ram: ImageVector? = null
