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

val VuesaxIconsTwotone.MoneySend: ImageVector
    get() {
        if (_MoneySend != null) {
            return _MoneySend!!
        }
        _MoneySend = ImageVector.Builder(
            name = "MoneySend",
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
                moveTo(9.5f, 13.75f)
                curveTo(9.5f, 14.72f, 10.25f, 15.5f, 11.17f, 15.5f)
                horizontalLineTo(13.05f)
                curveTo(13.85f, 15.5f, 14.5f, 14.82f, 14.5f, 13.97f)
                curveTo(14.5f, 13.06f, 14.1f, 12.73f, 13.51f, 12.52f)
                lineTo(10.5f, 11.47f)
                curveTo(9.91f, 11.26f, 9.51f, 10.94f, 9.51f, 10.02f)
                curveTo(9.51f, 9.18f, 10.16f, 8.49f, 10.96f, 8.49f)
                horizontalLineTo(12.84f)
                curveTo(13.76f, 8.49f, 14.51f, 9.27f, 14.51f, 10.24f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.5f)
                verticalLineTo(16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 17.52f, 17.52f, 22f, 12f, 22f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                lineTo(22f, 2f)
            }
        }.build()

        return _MoneySend!!
    }

@Suppress("ObjectPropertyName")
private var _MoneySend: ImageVector? = null
