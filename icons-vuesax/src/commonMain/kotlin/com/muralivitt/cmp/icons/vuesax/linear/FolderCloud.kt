package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FolderCloud: ImageVector
    get() {
        if (_FolderCloud != null) {
            return _FolderCloud!!
        }
        _FolderCloud = ImageVector.Builder(
            name = "FolderCloud",
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
                moveTo(9f, 22f)
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
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.76f, 18.32f)
                curveTo(11.41f, 18.49f, 11.41f, 21.89f, 13.76f, 22.06f)
                horizontalLineTo(19.32f)
                curveTo(19.99f, 22.06f, 20.65f, 21.81f, 21.14f, 21.36f)
                curveTo(22.79f, 19.92f, 21.91f, 17.04f, 19.74f, 16.77f)
                curveTo(18.96f, 12.08f, 12.18f, 13.86f, 13.78f, 18.33f)
            }
        }.build()

        return _FolderCloud!!
    }

@Suppress("ObjectPropertyName")
private var _FolderCloud: ImageVector? = null
