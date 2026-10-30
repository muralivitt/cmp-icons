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

val VuesaxIconsTwotone.Receipt2: ImageVector
    get() {
        if (_Receipt2 != null) {
            return _Receipt2!!
        }
        _Receipt2 = ImageVector.Builder(
            name = "Receipt2",
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
                moveTo(20f, 7.04f)
                verticalLineTo(16.96f)
                curveTo(20f, 18.48f, 19.86f, 19.56f, 19.5f, 20.33f)
                curveTo(19.5f, 20.34f, 19.49f, 20.36f, 19.48f, 20.37f)
                curveTo(19.26f, 20.65f, 18.97f, 20.79f, 18.63f, 20.79f)
                curveTo(18.1f, 20.79f, 17.46f, 20.44f, 16.77f, 19.7f)
                curveTo(15.95f, 18.82f, 14.69f, 18.89f, 13.97f, 19.85f)
                lineTo(12.96f, 21.19f)
                curveTo(12.56f, 21.73f, 12.03f, 22f, 11.5f, 22f)
                curveTo(10.97f, 22f, 10.44f, 21.73f, 10.04f, 21.19f)
                lineTo(9.02f, 19.84f)
                curveTo(8.31f, 18.89f, 7.06f, 18.82f, 6.24f, 19.69f)
                lineTo(6.23f, 19.7f)
                curveTo(5.1f, 20.91f, 4.1f, 21.09f, 3.52f, 20.37f)
                curveTo(3.51f, 20.36f, 3.5f, 20.34f, 3.5f, 20.33f)
                curveTo(3.14f, 19.56f, 3f, 18.48f, 3f, 16.96f)
                verticalLineTo(7.04f)
                curveTo(3f, 5.52f, 3.14f, 4.44f, 3.5f, 3.67f)
                curveTo(3.5f, 3.66f, 3.5f, 3.65f, 3.52f, 3.64f)
                curveTo(4.09f, 2.91f, 5.1f, 3.09f, 6.23f, 4.3f)
                lineTo(6.24f, 4.31f)
                curveTo(7.06f, 5.18f, 8.31f, 5.11f, 9.02f, 4.16f)
                lineTo(10.04f, 2.81f)
                curveTo(10.44f, 2.27f, 10.97f, 2f, 11.5f, 2f)
                curveTo(12.03f, 2f, 12.56f, 2.27f, 12.96f, 2.81f)
                lineTo(13.97f, 4.15f)
                curveTo(14.69f, 5.11f, 15.95f, 5.18f, 16.77f, 4.3f)
                curveTo(17.46f, 3.56f, 18.1f, 3.21f, 18.63f, 3.21f)
                curveTo(18.97f, 3.21f, 19.26f, 3.36f, 19.48f, 3.64f)
                curveTo(19.5f, 3.65f, 19.5f, 3.66f, 19.5f, 3.67f)
                curveTo(19.86f, 4.44f, 20f, 5.52f, 20f, 7.04f)
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
                moveTo(8f, 10.25f)
                horizontalLineTo(16f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13.75f)
                horizontalLineTo(14f)
            }
        }.build()

        return _Receipt2!!
    }

@Suppress("ObjectPropertyName")
private var _Receipt2: ImageVector? = null
