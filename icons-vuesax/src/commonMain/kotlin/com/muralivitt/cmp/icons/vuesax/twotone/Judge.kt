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

val VuesaxIconsTwotone.Judge: ImageVector
    get() {
        if (_Judge != null) {
            return _Judge!!
        }
        _Judge = ImageVector.Builder(
            name = "Judge",
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
                moveTo(20.01f, 18.51f)
                lineTo(15.061f, 13.56f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.06f, 13.56f)
                lineTo(11.52f, 17.1f)
                curveTo(10.74f, 17.88f, 9.47f, 17.88f, 8.69f, 17.1f)
                lineTo(4.45f, 12.86f)
                curveTo(3.67f, 12.08f, 3.67f, 10.81f, 4.45f, 10.03f)
                lineTo(11.52f, 2.96f)
                curveTo(12.3f, 2.18f, 13.57f, 2.18f, 14.35f, 2.96f)
                lineTo(18.59f, 7.2f)
                curveTo(19.37f, 7.98f, 19.37f, 9.25f, 18.59f, 10.03f)
                lineTo(15.06f, 13.56f)
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
                moveTo(2f, 21f)
                horizontalLineTo(8f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.561f, 7.92f)
                lineTo(13.631f, 14.99f)
            }
        }.build()

        return _Judge!!
    }

@Suppress("ObjectPropertyName")
private var _Judge: ImageVector? = null
