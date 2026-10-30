package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DocumentUpload: ImageVector
    get() {
        if (_DocumentUpload != null) {
            return _DocumentUpload!!
        }
        _DocumentUpload = ImageVector.Builder(
            name = "DocumentUpload",
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
                moveTo(9f, 17f)
                verticalLineTo(11f)
                lineTo(7f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                lineTo(11f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                verticalLineTo(15f)
                curveTo(22f, 20f, 20f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 2f, 20f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                horizontalLineTo(18f)
                curveTo(15f, 10f, 14f, 9f, 14f, 6f)
                verticalLineTo(2f)
                lineTo(22f, 10f)
                close()
            }
        }.build()

        return _DocumentUpload!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentUpload: ImageVector? = null
