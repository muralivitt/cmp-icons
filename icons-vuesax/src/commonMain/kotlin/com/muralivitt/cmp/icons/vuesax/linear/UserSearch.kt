package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.UserSearch: ImageVector
    get() {
        if (_UserSearch != null) {
            return _UserSearch!!
        }
        _UserSearch = ImageVector.Builder(
            name = "UserSearch",
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
                moveTo(12f, 12f)
                curveTo(14.761f, 12f, 17f, 9.761f, 17f, 7f)
                curveTo(17f, 4.239f, 14.761f, 2f, 12f, 2f)
                curveTo(9.239f, 2f, 7f, 4.239f, 7f, 7f)
                curveTo(7f, 9.761f, 9.239f, 12f, 12f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.41f, 22f)
                curveTo(3.41f, 18.13f, 7.26f, 15f, 12f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.2f, 21.4f)
                curveTo(19.967f, 21.4f, 21.4f, 19.967f, 21.4f, 18.2f)
                curveTo(21.4f, 16.433f, 19.967f, 15f, 18.2f, 15f)
                curveTo(16.433f, 15f, 15f, 16.433f, 15f, 18.2f)
                curveTo(15f, 19.967f, 16.433f, 21.4f, 18.2f, 21.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineTo(21f, 21f)
            }
        }.build()

        return _UserSearch!!
    }

@Suppress("ObjectPropertyName")
private var _UserSearch: ImageVector? = null
