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

val VuesaxIconsTwotone.SearchFavorite: ImageVector
    get() {
        if (_SearchFavorite != null) {
            return _SearchFavorite!!
        }
        _SearchFavorite = ImageVector.Builder(
            name = "SearchFavorite",
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
                moveTo(20f, 11f)
                curveTo(20f, 15.97f, 15.97f, 20f, 11f, 20f)
                curveTo(6.03f, 20f, 2f, 15.97f, 2f, 11f)
                curveTo(2f, 6.03f, 6.03f, 2f, 11f, 2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 6.13f)
                curveTo(13.15f, 5.03f, 13.56f, 3.66f, 14.72f, 3.29f)
                curveTo(15.33f, 3.09f, 16.08f, 3.26f, 16.51f, 3.85f)
                curveTo(16.91f, 3.24f, 17.69f, 3.1f, 18.29f, 3.29f)
                curveTo(19.45f, 3.66f, 19.86f, 5.03f, 19.51f, 6.13f)
                curveTo(18.96f, 7.88f, 17.04f, 8.79f, 16.51f, 8.79f)
                curveTo(15.97f, 8.79f, 14.07f, 7.9f, 13.5f, 6.13f)
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
                moveTo(18.93f, 20.69f)
                curveTo(19.46f, 22.29f, 20.67f, 22.45f, 21.6f, 21.05f)
                curveTo(22.45f, 19.77f, 21.89f, 18.72f, 20.35f, 18.72f)
                curveTo(19.21f, 18.71f, 18.57f, 19.6f, 18.93f, 20.69f)
                close()
            }
        }.build()

        return _SearchFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _SearchFavorite: ImageVector? = null
