package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Gift",
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
                moveTo(19.97f, 10f)
                horizontalLineTo(3.97f)
                verticalLineTo(18f)
                curveTo(3.97f, 21f, 4.97f, 22f, 7.97f, 22f)
                horizontalLineTo(15.97f)
                curveTo(18.97f, 22f, 19.97f, 21f, 19.97f, 18f)
                verticalLineTo(10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.5f, 7f)
                verticalLineTo(8f)
                curveTo(21.5f, 9.1f, 20.97f, 10f, 19.5f, 10f)
                horizontalLineTo(4.5f)
                curveTo(2.97f, 10f, 2.5f, 9.1f, 2.5f, 8f)
                verticalLineTo(7f)
                curveTo(2.5f, 5.9f, 2.97f, 5f, 4.5f, 5f)
                horizontalLineTo(19.5f)
                curveTo(20.97f, 5f, 21.5f, 5.9f, 21.5f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.64f, 5f)
                horizontalLineTo(6.12f)
                curveTo(5.78f, 4.63f, 5.79f, 4.06f, 6.15f, 3.7f)
                lineTo(7.57f, 2.28f)
                curveTo(7.94f, 1.91f, 8.55f, 1.91f, 8.92f, 2.28f)
                lineTo(11.64f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.87f, 5f)
                horizontalLineTo(12.35f)
                lineTo(15.07f, 2.28f)
                curveTo(15.44f, 1.91f, 16.05f, 1.91f, 16.42f, 2.28f)
                lineTo(17.84f, 3.7f)
                curveTo(18.2f, 4.06f, 18.21f, 4.63f, 17.87f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.94f, 10f)
                verticalLineTo(15.14f)
                curveTo(8.94f, 15.94f, 9.82f, 16.41f, 10.49f, 15.98f)
                lineTo(11.43f, 15.36f)
                curveTo(11.77f, 15.14f, 12.2f, 15.14f, 12.53f, 15.36f)
                lineTo(13.42f, 15.96f)
                curveTo(14.08f, 16.4f, 14.97f, 15.93f, 14.97f, 15.13f)
                verticalLineTo(10f)
                horizontalLineTo(8.94f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null
