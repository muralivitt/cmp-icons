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

val VuesaxIconsTwotone.Like: ImageVector
    get() {
        if (_Like != null) {
            return _Like!!
        }
        _Like = ImageVector.Builder(
            name = "Like",
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
                moveTo(18f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6f)
                curveTo(4.34f, 18.86f, 3f, 17.53f, 3f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(3f, 3.34f, 4.34f, 2.01f, 6f, 2.01f)
                horizontalLineTo(18f)
                curveTo(19.66f, 2.01f, 21f, 3.34f, 21f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21f, 17.52f, 19.66f, 18.86f, 18f, 18.86f)
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
                moveTo(12.28f, 14.96f)
                curveTo(12.13f, 15.01f, 11.88f, 15.01f, 11.72f, 14.96f)
                curveTo(10.42f, 14.51f, 7.5f, 12.66f, 7.5f, 9.51f)
                curveTo(7.5f, 8.12f, 8.62f, 7f, 10f, 7f)
                curveTo(10.82f, 7f, 11.54f, 7.39f, 12f, 8f)
                curveTo(12.46f, 7.39f, 13.18f, 7f, 14f, 7f)
                curveTo(15.38f, 7f, 16.5f, 8.12f, 16.5f, 9.51f)
                curveTo(16.49f, 12.66f, 13.58f, 14.51f, 12.28f, 14.96f)
                close()
            }
        }.build()

        return _Like!!
    }

@Suppress("ObjectPropertyName")
private var _Like: ImageVector? = null
