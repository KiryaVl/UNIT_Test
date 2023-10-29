import pytest
from ListComparer import ListComparer


def test_compare_lists_list1_greater():
    comparer = ListComparer([4, 5, 6], [1, 2, 3])
    result = comparer.compare_lists()
    assert result == "Первый список имеет большее среднее значение"


def test_compare_lists_list2_greater():
    comparer = ListComparer([1, 2, 3], [4, 5, 6])
    result = comparer.compare_lists()
    assert result == "Второй список имеет большее среднее значение"


def test_compare_lists_equal_average():
    comparer = ListComparer([1, 2, 3], [1, 2, 3])
    result = comparer.compare_lists()
    assert result == "Средние значения равны"


def test_compare_lists_empty_lists():
    comparer = ListComparer([], [])
    result = comparer.compare_lists()
    assert result == "Средние значения равны"
