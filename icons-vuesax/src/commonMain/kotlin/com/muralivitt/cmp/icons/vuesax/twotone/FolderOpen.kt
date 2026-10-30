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

val VuesaxIconsTwotone.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) {
            return _FolderOpen!!
        }
        _FolderOpen = ImageVector.Builder(
            name = "FolderOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(21.671f, 14.3f)
                lineTo(21.271f, 19.3f)
                curveTo(21.121f, 20.83f, 21.001f, 22f, 18.291f, 22f)
                horizontalLineTo(5.711f)
                curveTo(3.001f, 22f, 2.881f, 20.83f, 2.731f, 19.3f)
                lineTo(2.331f, 14.3f)
                curveTo(2.251f, 13.47f, 2.511f, 12.7f, 2.981f, 12.11f)
                curveTo(2.991f, 12.1f, 2.991f, 12.1f, 3.001f, 12.09f)
                curveTo(3.551f, 11.42f, 4.381f, 11f, 5.311f, 11f)
                horizontalLineTo(18.691f)
                curveTo(19.621f, 11f, 20.441f, 11.42f, 20.981f, 12.07f)
                curveTo(20.991f, 12.08f, 21.001f, 12.09f, 21.001f, 12.1f)
                curveTo(21.491f, 12.69f, 21.761f, 13.46f, 21.671f, 14.3f)
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
                moveTo(3.5f, 11.43f)
                verticalLineTo(6.28f)
                curveTo(3.5f, 2.88f, 4.35f, 2.03f, 7.75f, 2.03f)
                horizontalLineTo(9.02f)
                curveTo(10.29f, 2.03f, 10.58f, 2.41f, 11.06f, 3.05f)
                lineTo(12.33f, 4.75f)
                curveTo(12.65f, 5.17f, 12.84f, 5.43f, 13.69f, 5.43f)
                horizontalLineTo(16.24f)
                curveTo(19.64f, 5.43f, 20.49f, 6.28f, 20.49f, 9.68f)
                verticalLineTo(11.47f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.43f, 17f)
                horizontalLineTo(14.57f)
            }
        }.build()

        return _FolderOpen!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpen: ImageVector? = null
