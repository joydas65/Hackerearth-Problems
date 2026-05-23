import sys
from bisect import bisect_left, bisect_right

def main():
    inputTokens = sys.stdin.buffer.read().split()
    tokenIndex = 0

    numIntervals = int(inputTokens[tokenIndex]); tokenIndex += 1

    intervals          = []
    sortedLeftPoints   = []
    sortedRightPoints  = []

    for _ in range(numIntervals):
        leftPoint  = int(inputTokens[tokenIndex]); tokenIndex += 1
        rightPoint = int(inputTokens[tokenIndex]); tokenIndex += 1
        intervals.append((leftPoint, rightPoint))
        sortedLeftPoints.append(leftPoint)
        sortedRightPoints.append(rightPoint)

    sortedLeftPoints.sort()
    sortedRightPoints.sort()

    minimumOverlapCount = numIntervals  # upper bound

    for leftPoint, rightPoint in intervals:
        intervalsStartingAfterRight = numIntervals - bisect_right(sortedLeftPoints, rightPoint)
        intervalsEndingBeforeLeft   = bisect_left(sortedRightPoints, leftPoint)

        overlapCount = (numIntervals - 1) - intervalsStartingAfterRight - intervalsEndingBeforeLeft
        if overlapCount < minimumOverlapCount:
            minimumOverlapCount = overlapCount

    print(minimumOverlapCount)

main()
