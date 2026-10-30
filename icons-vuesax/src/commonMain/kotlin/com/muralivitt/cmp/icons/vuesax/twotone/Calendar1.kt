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

val VuesaxIconsTwotone.Calendar1: ImageVector
    get() {
        if (_Calendar1 != null) {
            return _Calendar1!!
        }
        _Calendar1 = ImageVector.Builder(
            name = "Calendar1",
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
                moveTo(8f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3.5f)
                curveTo(19.33f, 3.68f, 21f, 4.95f, 21f, 9.65f)
                verticalLineTo(15.83f)
                curveTo(21f, 19.95f, 20f, 22.01f, 15f, 22.01f)
                horizontalLineTo(9f)
                curveTo(4f, 22.01f, 3f, 19.95f, 3f, 15.83f)
                verticalLineTo(9.65f)
                curveTo(3f, 4.95f, 4.67f, 3.69f, 8f, 3.5f)
                horizontalLineTo(16f)
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
                moveTo(20.75f, 17.6f)
                horizontalLineTo(3.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f
            ) {
                moveTo(12f, 8.25f)
                curveTo(10.77f, 8.25f, 9.73f, 8.92f, 9.73f, 10.22f)
                curveTo(9.73f, 10.84f, 10.02f, 11.31f, 10.46f, 11.61f)
                curveTo(9.85f, 11.97f, 9.5f, 12.55f, 9.5f, 13.23f)
                curveTo(9.5f, 14.47f, 10.45f, 15.24f, 12f, 15.24f)
                curveTo(13.54f, 15.24f, 14.5f, 14.47f, 14.5f, 13.23f)
                curveTo(14.5f, 12.55f, 14.15f, 11.96f, 13.53f, 11.61f)
                curveTo(13.98f, 11.3f, 14.26f, 10.84f, 14.26f, 10.22f)
                curveTo(14.26f, 8.92f, 13.23f, 8.25f, 12f, 8.25f)
                close()
                moveTo(12f, 11.09f)
                curveTo(11.48f, 11.09f, 11.1f, 10.78f, 11.1f, 10.29f)
                curveTo(11.1f, 9.79f, 11.48f, 9.5f, 12f, 9.5f)
                curveTo(12.52f, 9.5f, 12.9f, 9.79f, 12.9f, 10.29f)
                curveTo(12.9f, 10.78f, 12.52f, 11.09f, 12f, 11.09f)
                close()
                moveTo(12f, 14f)
                curveTo(11.34f, 14f, 10.86f, 13.67f, 10.86f, 13.07f)
                curveTo(10.86f, 12.47f, 11.34f, 12.15f, 12f, 12.15f)
                curveTo(12.66f, 12.15f, 13.14f, 12.48f, 13.14f, 13.07f)
                curveTo(13.14f, 13.67f, 12.66f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _Calendar1!!
    }

@Suppress("ObjectPropertyName")
private var _Calendar1: ImageVector? = null
