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

val VuesaxIconsTwotone.FolderConnection: ImageVector
    get() {
        if (_FolderConnection != null) {
            return _FolderConnection!!
        }
        _FolderConnection = ImageVector.Builder(
            name = "FolderConnection",
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
                moveTo(12f, 16f)
                verticalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 23f)
                curveTo(13.105f, 23f, 14f, 22.105f, 14f, 21f)
                curveTo(14f, 19.895f, 13.105f, 19f, 12f, 19f)
                curveTo(10.895f, 19f, 10f, 19.895f, 10f, 21f)
                curveTo(10f, 22.105f, 10.895f, 23f, 12f, 23f)
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
                moveTo(18f, 21f)
                horizontalLineTo(14f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 21f)
                horizontalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(19f, 8.3f)
                verticalLineTo(12.5f)
                curveTo(19f, 15.3f, 18.3f, 16f, 15.5f, 16f)
                horizontalLineTo(8.5f)
                curveTo(5.7f, 16f, 5f, 15.3f, 5f, 12.5f)
                verticalLineTo(5.5f)
                curveTo(5f, 2.7f, 5.7f, 2f, 8.5f, 2f)
                horizontalLineTo(9.55f)
                curveTo(10.6f, 2f, 10.83f, 2.31f, 11.23f, 2.84f)
                lineTo(12.28f, 4.24f)
                curveTo(12.55f, 4.59f, 12.7f, 4.8f, 13.4f, 4.8f)
                horizontalLineTo(15.5f)
                curveTo(18.3f, 4.8f, 19f, 5.5f, 19f, 8.3f)
                close()
            }
        }.build()

        return _FolderConnection!!
    }

@Suppress("ObjectPropertyName")
private var _FolderConnection: ImageVector? = null
