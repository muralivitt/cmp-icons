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

val VuesaxIconsTwotone.DirectboxNotif: ImageVector
    get() {
        if (_DirectboxNotif != null) {
            return _DirectboxNotif!!
        }
        _DirectboxNotif = ImageVector.Builder(
            name = "DirectboxNotif",
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
                moveTo(7f, 12f)
                curveTo(3f, 12f, 3f, 13.79f, 3f, 16f)
                verticalLineTo(17f)
                curveTo(3f, 19.76f, 3f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(20f, 22f, 21f, 19.76f, 21f, 17f)
                verticalLineTo(16f)
                curveTo(21f, 13.79f, 21f, 12f, 17f, 12f)
                curveTo(16f, 12f, 15.72f, 12.21f, 15.2f, 12.6f)
                lineTo(14.18f, 13.68f)
                curveTo(13f, 14.94f, 11f, 14.94f, 9.81f, 13.68f)
                lineTo(8.8f, 12.6f)
                curveTo(8.28f, 12.21f, 8f, 12f, 7f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 12f)
                verticalLineTo(6f)
                curveTo(19f, 3.79f, 19f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(5f, 2f, 5f, 3.79f, 5f, 6f)
                verticalLineTo(12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.551f, 9.23f)
                horizontalLineTo(13.881f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.721f, 6.23f)
                horizontalLineTo(14.721f)
            }
        }.build()

        return _DirectboxNotif!!
    }

@Suppress("ObjectPropertyName")
private var _DirectboxNotif: ImageVector? = null
