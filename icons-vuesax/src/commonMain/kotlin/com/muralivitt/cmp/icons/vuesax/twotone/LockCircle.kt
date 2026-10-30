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

val VuesaxIconsTwotone.LockCircle: ImageVector
    get() {
        if (_LockCircle != null) {
            return _LockCircle!!
        }
        _LockCircle = ImageVector.Builder(
            name = "LockCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                verticalLineTo(10f)
                curveTo(9f, 8.34f, 9.5f, 7f, 12f, 7f)
                curveTo(14.5f, 7f, 15f, 8.34f, 15f, 10f)
                verticalLineTo(11f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14.6f)
                curveTo(12.332f, 14.6f, 12.6f, 14.331f, 12.6f, 14f)
                curveTo(12.6f, 13.668f, 12.332f, 13.4f, 12f, 13.4f)
                curveTo(11.669f, 13.4f, 11.4f, 13.668f, 11.4f, 14f)
                curveTo(11.4f, 14.331f, 11.669f, 14.6f, 12f, 14.6f)
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
                moveTo(14.5f, 17f)
                horizontalLineTo(9.5f)
                curveTo(7.5f, 17f, 7f, 16.5f, 7f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(7f, 11.5f, 7.5f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                curveTo(16.5f, 11f, 17f, 11.5f, 17f, 13.5f)
                verticalLineTo(14.5f)
                curveTo(17f, 16.5f, 16.5f, 17f, 14.5f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _LockCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LockCircle: ImageVector? = null
