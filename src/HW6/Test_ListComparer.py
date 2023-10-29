import pytest
from List_Comparer import List_Comparer


def test_compare_lists_list1_greater():
    comparer = List_Comparer([4, 5, 6], [1, 2, 3])
    result = comparer.compare_lists()
    assert result == "Первый список имеет большее среднее значение"


def test_compare_lists_list2_greater():
    comparer = List_Comparer([1, 2, 3], [4, 5, 6])
    result = comparer.compare_lists()
    assert result == "Второй список имеет большее среднее значение"


def test_compare_lists_equal_average():
    comparer = List_Comparer([1, 2, 3], [1, 2, 3])
    result = comparer.compare_lists()
    assert result == "Средние значения равны"


def test_compare_lists_empty_lists():
    comparer = List_Comparer([], [])
    result = comparer.compare_lists()
    assert result == "Средние значения равны"
