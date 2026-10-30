package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FolderFavorite: ImageVector
    get() {
        if (_FolderFavorite != null) {
            return _FolderFavorite!!
        }
        _FolderFavorite = ImageVector.Builder(
            name = "FolderFavorite",
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
                moveTo(9.2f, 14.78f)
                lineTo(11.78f, 17.04f)
                curveTo(11.9f, 17.15f, 12.09f, 17.15f, 12.21f, 17.04f)
                lineTo(14.79f, 14.78f)
                curveTo(15.46f, 14.19f, 15.55f, 13.19f, 14.99f, 12.49f)
                curveTo(14.43f, 11.79f, 13.41f, 11.66f, 12.7f, 12.2f)
                lineTo(12f, 12.74f)
                lineTo(11.29f, 12.21f)
                curveTo(10.57f, 11.67f, 9.56f, 11.8f, 9f, 12.5f)
                curveTo(8.44f, 13.19f, 8.53f, 14.2f, 9.2f, 14.78f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(22f, 11f)
                verticalLineTo(17f)
                curveTo(22f, 21f, 21f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(3f, 22f, 2f, 21f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 3f, 3f, 2f, 7f, 2f)
                horizontalLineTo(8.5f)
                curveTo(10f, 2f, 10.33f, 2.44f, 10.9f, 3.2f)
                lineTo(12.4f, 5.2f)
                curveTo(12.78f, 5.7f, 13f, 6f, 14f, 6f)
                horizontalLineTo(17f)
                curveTo(21f, 6f, 22f, 7f, 22f, 11f)
                close()
            }
        }.build()

        return _FolderFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _FolderFavorite: ImageVector? = null
