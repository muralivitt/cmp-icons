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

val VuesaxIconsTwotone.SearchFavorite1: ImageVector
    get() {
        if (_SearchFavorite1 != null) {
            return _SearchFavorite1!!
        }
        _SearchFavorite1 = ImageVector.Builder(
            name = "SearchFavorite1",
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
                moveTo(21f, 11.5f)
                curveTo(21f, 16.75f, 16.75f, 21f, 11.5f, 21f)
                curveTo(6.25f, 21f, 2f, 16.75f, 2f, 11.5f)
                curveTo(2f, 6.25f, 6.25f, 2f, 11.5f, 2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineTo(20f, 20f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 6.13f)
                curveTo(14.15f, 5.03f, 14.56f, 3.66f, 15.72f, 3.29f)
                curveTo(16.33f, 3.09f, 17.08f, 3.26f, 17.51f, 3.85f)
                curveTo(17.91f, 3.24f, 18.69f, 3.1f, 19.29f, 3.29f)
                curveTo(20.45f, 3.66f, 20.86f, 5.03f, 20.51f, 6.13f)
                curveTo(19.96f, 7.88f, 18.04f, 8.79f, 17.51f, 8.79f)
                curveTo(16.97f, 8.79f, 15.07f, 7.9f, 14.5f, 6.13f)
                close()
            }
        }.build()

        return _SearchFavorite1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchFavorite1: ImageVector? = null
