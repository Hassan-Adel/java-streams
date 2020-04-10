package com.tutorial;

import com.tutorial.lambdas.LambdasDemo;
import com.tutorial.lambdas.Printer;
import com.tutorial.lambdas.ConsolePrinter;
import com.tutorial.streams.StreamsDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StreamsDemo.show();
        StreamsDemo.CreateStreams();
        StreamsDemo.MapElements();
        StreamsDemo.FilteringStreams();
        StreamsDemo.SlicingStreams();
        StreamsDemo.SortingStreams();
        StreamsDemo.GetUniqueValuesFromStream();
        StreamsDemo.PeekElementsInStream();
        StreamsDemo.StreamReducers();
        StreamsDemo.GeneralStreamReducers();
        StreamsDemo.Collectors();
        StreamsDemo.GroupingElements();
        StreamsDemo.PartitioningElements();
    }
}
