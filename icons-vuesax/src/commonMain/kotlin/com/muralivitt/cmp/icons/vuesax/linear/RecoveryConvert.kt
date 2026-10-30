package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.RecoveryConvert: ImageVector
    get() {
        if (_RecoveryConvert != null) {
            return _RecoveryConvert!!
        }
        _RecoveryConvert = ImageVector.Builder(
            name = "RecoveryConvert",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.6f, 11.58f)
                verticalLineTo(14.31f)
                curveTo(13.6f, 16.59f, 12.69f, 17.5f, 10.41f, 17.5f)
                horizontalLineTo(7.69f)
                curveTo(5.42f, 17.5f, 4.5f, 16.59f, 4.5f, 14.31f)
                verticalLineTo(11.58f)
                curveTo(4.5f, 9.31f, 5.41f, 8.4f, 7.69f, 8.4f)
                horizontalLineTo(10.42f)
                curveTo(12.69f, 8.4f, 13.6f, 9.31f, 13.6f, 11.58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 7.68f)
                verticalLineTo(10.41f)
                curveTo(17.5f, 12.69f, 16.59f, 13.6f, 14.31f, 13.6f)
                horizontalLineTo(13.6f)
                verticalLineTo(11.58f)
                curveTo(13.6f, 9.31f, 12.69f, 8.4f, 10.41f, 8.4f)
                horizontalLineTo(8.4f)
                verticalLineTo(7.68f)
                curveTo(8.4f, 5.4f, 9.31f, 4.5f, 11.59f, 4.5f)
                horizontalLineTo(14.32f)
                curveTo(16.59f, 4.5f, 17.5f, 5.41f, 17.5f, 7.68f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 14f)
                curveTo(21f, 17.87f, 17.87f, 21f, 14f, 21f)
                lineTo(15.05f, 19.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1f, 8f)
                curveTo(1f, 4.13f, 4.13f, 1f, 8f, 1f)
                lineTo(6.95f, 2.75f)
            }
        }.build()

        return _RecoveryConvert!!
    }

@Suppress("ObjectPropertyName")
private var _RecoveryConvert: ImageVector? = null
