package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DocumentFavorite: ImageVector
    get() {
        if (_DocumentFavorite != null) {
            return _DocumentFavorite!!
        }
        _DocumentFavorite = ImageVector.Builder(
            name = "DocumentFavorite",
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.62f, 15.73f)
                curveTo(6.29f, 14.7f, 6.68f, 13.43f, 7.75f, 13.08f)
                curveTo(8.32f, 12.9f, 9.02f, 13.05f, 9.41f, 13.6f)
                curveTo(9.78f, 13.03f, 10.51f, 12.9f, 11.07f, 13.08f)
                curveTo(12.15f, 13.43f, 12.53f, 14.7f, 12.21f, 15.73f)
                curveTo(11.7f, 17.36f, 9.91f, 18.21f, 9.41f, 18.21f)
                curveTo(8.92f, 18.2f, 7.15f, 17.37f, 6.62f, 15.73f)
                close()
            }
        }.build()

        return _DocumentFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFavorite: ImageVector? = null
