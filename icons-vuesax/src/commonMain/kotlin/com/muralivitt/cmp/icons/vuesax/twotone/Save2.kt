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

val VuesaxIconsTwotone.Save2: ImageVector
    get() {
        if (_Save2 != null) {
            return _Save2!!
        }
        _Save2 = ImageVector.Builder(
            name = "Save2",
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
                moveTo(12.89f, 5.88f)
                horizontalLineTo(5.11f)
                curveTo(3.4f, 5.88f, 2f, 7.28f, 2f, 8.99f)
                verticalLineTo(20.35f)
                curveTo(2f, 21.8f, 3.04f, 22.42f, 4.31f, 21.71f)
                lineTo(8.24f, 19.52f)
                curveTo(8.66f, 19.29f, 9.34f, 19.29f, 9.75f, 19.52f)
                lineTo(13.68f, 21.71f)
                curveTo(14.95f, 22.42f, 15.99f, 21.8f, 15.99f, 20.35f)
                verticalLineTo(8.99f)
                curveTo(16f, 7.28f, 14.6f, 5.88f, 12.89f, 5.88f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8.99f)
                verticalLineTo(20.35f)
                curveTo(16f, 21.8f, 14.96f, 22.41f, 13.69f, 21.71f)
                lineTo(9.76f, 19.52f)
                curveTo(9.34f, 19.29f, 8.66f, 19.29f, 8.24f, 19.52f)
                lineTo(4.31f, 21.71f)
                curveTo(3.04f, 22.41f, 2f, 21.8f, 2f, 20.35f)
                verticalLineTo(8.99f)
                curveTo(2f, 7.28f, 3.4f, 5.88f, 5.11f, 5.88f)
                horizontalLineTo(12.89f)
                curveTo(14.6f, 5.88f, 16f, 7.28f, 16f, 8.99f)
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
                moveTo(22f, 5.11f)
                verticalLineTo(16.47f)
                curveTo(22f, 17.92f, 20.96f, 18.53f, 19.69f, 17.83f)
                lineTo(16f, 15.77f)
                verticalLineTo(8.99f)
                curveTo(16f, 7.28f, 14.6f, 5.88f, 12.89f, 5.88f)
                horizontalLineTo(8f)
                verticalLineTo(5.11f)
                curveTo(8f, 3.4f, 9.4f, 2f, 11.11f, 2f)
                horizontalLineTo(18.89f)
                curveTo(20.6f, 2f, 22f, 3.4f, 22f, 5.11f)
                close()
            }
        }.build()

        return _Save2!!
    }

@Suppress("ObjectPropertyName")
private var _Save2: ImageVector? = null
