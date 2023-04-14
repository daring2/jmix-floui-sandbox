package com.company.sandbox.view.testentity;

import com.company.sandbox.entity.TestEntity;

import com.company.sandbox.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "testEntities", layout = MainView.class)
@ViewController("sb_TestEntity.list")
@ViewDescriptor("test-entity-list-view.xml")
@LookupComponent("testEntitiesTable")
@DialogMode(width = "50em", height = "37.5em")
public class TestEntityListView extends StandardListView<TestEntity> {
}