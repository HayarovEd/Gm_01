package xo.appsforlife.DietMagic.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xo.appsforlife.DietMagic.R
import xo.appsforlife.DietMagic.data.mockData

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun MockScreen(
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(initialPage=0)
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(color = backMock),
        topBar = {
            Text(
                modifier = modifier.fillMaxWidth(),
                text = stringResource(id = R.string.title),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
    ) {
        Box(modifier = modifier
            .fillMaxSize()
            .padding(it)) {
            HorizontalPager(
                modifier = modifier.fillMaxWidth(),
                state = pagerState,
                pageCount = mockData.size
            ) {
                MockElement(itemMockData = mockData[it])
            }
            Row (
                modifier = modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(mockData.size) { iteration ->
                    val color = if (pagerState.currentPage == iteration) selected else unselected
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(16.dp)
                    )
                }
            }
        }
    }
}