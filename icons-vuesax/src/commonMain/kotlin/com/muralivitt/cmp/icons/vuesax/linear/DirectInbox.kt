package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DirectInbox: ImageVector
    get() {
        if (_DirectInbox != null) {
            return _DirectInbox!!
        }
        _DirectInbox = ImageVector.Builder(
            name = "DirectInbox",
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
                moveTo(12f, 2f)
                verticalLineTo(9f)
                lineTo(14f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                lineTo(10f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.98f, 13f)
                horizontalLineTo(6.39f)
                curveTo(6.77f, 13f, 7.11f, 13.21f, 7.28f, 13.55f)
                lineTo(8.45f, 15.89f)
                curveTo(8.79f, 16.57f, 9.48f, 17f, 10.24f, 17f)
                horizontalLineTo(13.77f)
                curveTo(14.53f, 17f, 15.22f, 16.57f, 15.56f, 15.89f)
                lineTo(16.73f, 13.55f)
                curveTo(16.9f, 13.21f, 17.25f, 13f, 17.62f, 13f)
                horizontalLineTo(21.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 4.13f)
                curveTo(3.46f, 4.65f, 2f, 6.73f, 2f, 11f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(11f)
                curveTo(22f, 6.73f, 20.54f, 4.65f, 17f, 4.13f)
            }
        }.build()

        return _DirectInbox!!
    }

@Suppress("ObjectPropertyName")
private var _DirectInbox: ImageVector? = null
