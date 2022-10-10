    def insertion_sort(self):
        for i in range(1, len(self.sorting_array)):
            key = self.sorting_array[i]
            j = i - 1
            if j >= 0 and self.sorting_array[j] < key:
                self.comparison_count += 1
            while j >= 0 and self.sorting_array[j] > key:
                self.comparison_count += 1
                self.sorting_array[j + 1] = self.sorting_array[j]
                j = j - 1
                if j >= 0 and self.sorting_array[j] < key:
                    self.comparison_count += 1
            self.sorting_array[j + 1] = key
        return self.sorting_array, self.comparison_count


if __name__ == '__main__':
    a = [2,3,1,4,5]
    sort = Sorting(a)
    sort, count = sort.insertion_sort()
    print(sort, "\t", count)
