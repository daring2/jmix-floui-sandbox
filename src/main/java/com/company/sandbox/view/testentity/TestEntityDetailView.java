package com.company.sandbox.view.testentity;

import com.company.sandbox.entity.TestEntity;

import com.company.sandbox.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "testEntities/:id", layout = MainView.class)
@ViewController("sb_TestEntity.detail")
@ViewDescriptor("test-entity-detail-view.xml")
@EditedEntityContainer("testEntityDc")
public class TestEntityDetailView extends StandardDetailView<TestEntity> {
}